#!/usr/bin/env bash

set -euo pipefail

main() {
    local MDKVERSION="${1:-1.18.2-40.1.0}"
    wget "https://maven.minecraftforge.net/net/minecraftforge/forge/${MDKVERSION}/forge-${MDKVERSION}-mdk.zip" \
        -O ./forge-mdk.zip && \
    unzip forge-mdk.zip && \
    rm forge-mdk.zip
}

main
