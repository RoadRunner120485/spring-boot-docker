#! /bin/sh

[ -e /usr/lib/apt/methods/https ] || {
  apt-get update
  apt-get install apt-transport-https
}
[ -e /usr/bin/docker ] || {
  sudo su
  apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys 36A1D7869245C8950F966E92D8576A8BA88D21E9
  sh -c "echo deb https://get.docker.com/ubuntu docker main> /etc/apt/sources.list.d/docker.list"
  apt-get update
  apt-get -y install lxc-docker
  echo "DOCKER_OPTS=\"\$DOCKER_OPTS --insecure-registry=registry.appdev.io\"" >> /etc/default/docker
  service docker restart
  exit

  # add vagrant to group docker and refresh session
  sudo gpasswd -a vagrant docker
  exec sudo su -l vagrant
}
