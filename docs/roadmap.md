Roadmap
====

* the most popular opensource git server is gitlab, and it's just a plan to distributed storing git reppositories, [here](https://gitlab.com/gitlab-org/gitlab-ce/issues/26897).
* [here](https://medium.com/@palantir/stemma-distributed-git-server-70afbca0fc29) are two solutions to make git repositories to be HA and to distributed stored.
	* distributed git servers with origin git command is github style
	* google using jgit to make the storage backend distributed, but [here](https://git.eclipse.org/r/#/c/64206/) is another pr from google to jgit to make a github style
	* talking to Jianfeng Chen, many companies have their own business service other than just git, those services all need a distributed storage, so maybe that's the reason google style come from

* git basic transfer [protocol](https://git-scm.com/book/en/v2/Git-Internals-Transfer-Protocols)
* git object style and storing, [here](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects)
* git ref tutorial is [here](https://git-scm.com/book/en/v2/Git-Internals-Git-References), there is also another type of object, tag object
* git [packfile](https://git-scm.com/book/en/v2/Git-Internals-Packfiles) used for saving disk space and save the requests when transfer through network with smart protocol
