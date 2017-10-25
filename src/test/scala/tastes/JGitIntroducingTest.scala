package tastes

import java.io.File

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.internal.storage.file.FileRepository
import org.eclipse.jgit.storage.file.FileRepositoryBuilder
import org.junit.rules.TemporaryFolder
import org.junit.{Rule, Test}


@Test
class JGitIntroducingTest {

  val tmp = new TemporaryFolder

  @Rule
  def getTemp() = tmp

  @Test
  def testCreate(): Unit = {

    val repoDir = this.tmp.newFolder("gitrepo.git")
    val repo = new FileRepository(repoDir)
    repo.create(true)

    val projDir = this.tmp.newFolder("gitproject")
    val gitDir = new File(projDir, ".git")
    val cloned = (new FileRepositoryBuilder)
      .setGitDir(gitDir)
      .setWorkTree(projDir)
      .build()

    cloned.create()
  }

  @Test
  def testClone(): Unit = {

    val tmp = this.tmp.newFolder("gitproject")
    Git.cloneRepository()
      .setURI("git://github.com/setekhid/ketos.git")
      .setDirectory(tmp)
      .call()
  }
}
