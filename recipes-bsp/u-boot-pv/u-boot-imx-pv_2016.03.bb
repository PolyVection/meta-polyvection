# Copyright (C) 2013-2016 Freescale Semiconductor

DESCRIPTION = "U-Boot provided by PolyVection with focus on PolyCore boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[sha256sum] = "7c632583c8e6cdb21ecfe9c26d4a3c535cd57077101b7285c5a796e91b755e44"
SRC_URI[md5sum] = "4f04cfd8933ed53c831e4d8c8fc5e18c"

SRCBRANCH = "imx_v2016.03_4.1.15_2.0.0_ga_PV"
UBOOT_SRC = "git://github.com/PolyVection/u-boot-imx.git;protocol=https"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"


PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
