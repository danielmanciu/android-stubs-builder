#!/bin/bash

working_dir="$(dirname "$(realpath "${BASH_SOURCE[0]}")")"
out_dir="$working_dir/out"
output_jar="$out_dir/android-stubs.jar"

# clean
rm -rf "$out_dir" || true
rm -rf "$output_jar" || true

# compile
find "$working_dir" -name "*.java" -exec javac -d "$out_dir" {} +

# package
jar cf "$output_jar" -C "$out_dir" .