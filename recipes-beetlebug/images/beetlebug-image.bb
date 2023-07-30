SUMMARY = "Basic Beetlebug image"
LICENSE = "GPL"
inherit core-image
IMAGE_FEATURES += "hwcodecs ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "mediamtx apache2 wireguard-tools"
DISTRO_FEATURES += "wifi"
