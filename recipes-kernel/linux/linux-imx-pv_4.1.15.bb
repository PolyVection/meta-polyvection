# Copyright (C) 2015-2016 PolyVection
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by PolyVection"
DESCRIPTION = "Linux Kernel provided and supported by PolyVection for \
PolyCore1 SoM and its peripherals."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

inherit kernel fsl-kernel-localversion fsl-vivante-kernel-driver-handler

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI[md5sum] = "054be7c35a8e298c6cbe6cee73096e45"


DEPENDS += "lzop-native bc-native"

SRCBRANCH = "4.1.15_pc1_dev"
LOCALVERSION = "-6UL_PC1"
SRCREV = "${AUTOREV}"
KERNEL_SRC ?= "git://github.com/PolyVection/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

S = "${WORKDIR}/git"

do_preconfigure_prepend() {
   # copy latest defconfig for imx_v7_defoonfig to use
   cp ${S}/arch/arm/configs/polycore1_defconfig ${WORKDIR}/.config
   cp ${S}/arch/arm/configs/polycore1_defconfig ${WORKDIR}/defconfig
}

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
COMPATIBLE_MACHINE = "(mx6|mx7|mx6ul)"