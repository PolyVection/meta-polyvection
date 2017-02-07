
DESCRIPTION = "Sigma-TCP for Sigma-DSP netowork configuration"
DEPENDS = "libconfig"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCBRANCH = "dev"
SRCREV = "1aace4f8ccfb1f69d101162c928c4854c09dd1e6"
SRC_URI = 	"git://github.com/polyvection/sigma-tcp.git;branch=${SRCBRANCH} "

do_install(){

}

S = "${WORKDIR}/git"

inherit autotools pkgconfig
