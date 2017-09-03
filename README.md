# meta-polyvection

PolyOS yocto layer for the VoltaStream boards - <http://www.voltastream.com/>.

## Description

This is the yocto meta layer we are using to create PolyOS for the VoltaStream boards. 

More information can be found at: <http://www.voltastream.com/> (Official Site)

## Dependencies

This layer depends on:

* URI: git://git.yoctoproject.org/poky
  * branch: pyro
  * revision: HEAD

* URI: git://git.openembedded.org/meta-openembedded
  * layers: meta-oe, meta-multimedia, meta-networking, meta-python
  * branch: pyro
  * revision: HEAD

* URI: git://github.com/Freescale/meta-freescale.git
  * branch: pyro
  * revision: HEAD

## Quick Start

1. source poky/oe-init-build-env build
2. Add this layer to bblayers.conf and the dependencies above
3. Set MACHINE in local.conf to one of the supported boards
4. bitbake polyos-image
5. dd to a SD card the generated sdimg file (use xzcat if rpi-sdimg.xz is used)
6. Boot your VoltaStream board.

## Maintainers

* Philip Voigt `<info at polyvection.com>`
