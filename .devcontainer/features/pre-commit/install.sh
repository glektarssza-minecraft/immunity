#!/usr/bin/env sh

# Import our function library.
. ./functions.sh;

# Set up Python 3 venv.
su ${_REMOTE_USER} -c 'python3 -m venv ~/.python3-venv' && \
# Add Python 3 venv to path.
su ${_REMOTE_USER} -c "sed -i 's|export PATH=\"\(.*\)\"|export PATH=\"\$HOME/.python3-venv/bin/:\1\"|' ~/.zshrc ~/.bashrc" && \
# Install pre-commit.
su ${_REMOTE_USER} -c 'python3 -m pip install pre-commit';
