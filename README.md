# spring-boot-docker
Spring Boot quickstart with gradle for docker

## Setup
First of all you need to [download](https://www.vagrantup.com/) and install Vagrant and install the following plugins: 

```
$ vagrant install plugin vagrant-hostmanager
$ vagrant install plugin vagrant-trigger
$ vagrant install plugin vagrant-cachier
```

Then checkout the repository ans start the environment:

```
$ git clone git@github.com:RoadRunner120485/spring-boot-docker.git
```

For saving bandwidth pull and store the latest docker images for jenkins and a docker registry:

```
$ cd vagrant-setup/provision/docker
$ docker pull jenkins
$ docker save -o jenkins.tar jenkins
$ docker pull registry
$ docker save -o registry.tar registry
```


```
$ cd vagrant-setup
$ vagrant up
```

## Links
- [https://coreos.com/docs/cluster-management/debugging/reading-the-system-log/]()
- [https://coreos.com/docs/cluster-management/setup/cloudinit-cloud-config/]()
- [https://coreos.com/docs/launching-containers/launching/getting-started-with-systemd/]()
- [https://coreos.com/docs/distributed-configuration/etcd-configuration/]()
- [https://coreos.com/docs/distributed-configuration/getting-started-with-etcd/]()
- [https://github.com/coreos/coreos-vagrant]()
- [http://kubernetes.io]()
- [https://github.com/pires/kubernetes-vagrant-coreos-cluster]()
- [https://github.com/google/cadvisor]()
- [http://fgrehm.viewdocs.io/vagrant-cachier]()
- [https://github.com/GoogleCloudPlatform/kubernetes]()
- [https://www.vagrantup.com/]()
- [http://docs.vagrantup.com/v2]()
- [http://docs.ruby-lang.org/en/2.0.0/Net/HTTP.html]()
- [https://docs.docker.com/]()
- [https://registry.hub.docker.com/_/registry/]()
- [https://github.com/docker-library/official-images]()
- [https://registry.hub.docker.com/_/jenkins/]()
- [https://jenkins-ci.org/]()



