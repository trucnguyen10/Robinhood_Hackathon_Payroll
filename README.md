# ALGOPAY.io

This solution will guide you in developing and deploying android application using the Algorand blockchain atomic transfer and smart contract that addresses the following use case:

Account creation

Funding accounts

Create and compile the teal program

Atomic transfer signed by the sender

Atomic transfer signed by a smart contract

For setting up a private, local network we will be using Algorand sandbox. 

This is a fast way to create and configure an Algorand development environment with [Algod](https://github.com/algorand/go-algorand) and [Indexer](https://github.com/algorand/indexer).

**Docker Compose** _MUST_ be installed. [Instructions](https://docs.docker.com/compose/install/).

On a _Windows_ machine, **Docker Desktop** comes with the necessary tools. Please see the [Windows](#windows) section in getting started for more details.

**Warning**: Algorand Sandbox is _not_ meant for production environments and should _not_ be used to store secure Algorand keys. Updates may reset all the data and keys that are stored.

Sandbox creates the following API endpoints:

- `algod`:
  - address: `http://localhost:4001`
  - token: `aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa`
- `kmd`:
  - address: `http://localhost:4002`
  - token: `aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa`
- `indexer`:
  - address: `http://localhost:8980`


## Getting Started

### Ubuntu and macOS

Make sure the docker daemon is running and docker-compose is installed.

Open a terminal and run:

```bash
git clone https://github.com/algorand/sandbox.git
```

In whatever local directory the sandbox should reside. Then:

```bash
cd sandbox
./sandbox up
```

This will run the `sandbox` shell script with the default configuration. See the [Basic Configuration](#basic-configuration) for other options.

<!-- markdownlint-disable-file MD034 -->

Note for Ubuntu: You may need to alias `docker` to `sudo docker` or follow the steps in https://docs.docker.com/install/linux/linux-postinstall so that a non-root user can use the command `docker`.

Run the test command for examples of how to interact with the environment:

```bash
./sandbox test
```

### Windows

Note: Be sure to use the latest version of Windows 10. Older versions may not work properly.

Note: While installing the following programs, several restarts may be required for windows to recognize the new software correctly.

#### Option 1: Using WSL 2

The [installation instructions](https://docs.docker.com/desktop/windows/install/) for Docker Desktop contain some of this but are repeated here.

1. In order to work with Docker Desktop on windows, a prerequisite is **WSL2** and [install instructions are available here](https://docs.microsoft.com/en-us/windows/wsl/install).
2. Install **Docker Desktop** using the [instructions available here](https://docs.docker.com/desktop/windows/install/).
3. We recommend using the official Windows Terminal, [available in the app store here](https://www.microsoft.com/en-us/p/windows-terminal/9n0dx20hk701).
4. Install whatever distribution of Linux desired.
5. Open the Windows Terminal with the distribution installed in the previous step and follow the instruction for Ubuntu and macOS above.

#### Option 2: Using Git for Windows/ MSYS 2 (not recommended)

This option is not fully tested and may cause issues.
It is recommended to use WSL 2.

1. Install Git for Windows: https://gitforwindows.org/
2. Install and launch Docker for Windows: https://docs.docker.com/get-docker
3. Open "Git Bash" and follow the instruction for Ubuntu and macOS above, in the "Git Bash" terminal.


After setting up the environment, this is how it should look like: 
![terminal](https://user-images.githubusercontent.com/44316521/192166505-c283f40f-dcaf-4248-842f-b1096bbdc1e1.png)
![Presentation 2](https://user-images.githubusercontent.com/44316521/192166511-b059aa9a-545b-4fbf-aff2-f13ad5bf76b4.png)

#Demo

![ui](https://user-images.githubusercontent.com/44316521/192166593-fec6dba0-27c2-4cd3-b433-ff4e181d40f6.jpg)

# Setup Development Environment
To get started, your android studio should be up and running. To get the code on your android studio, simply click the clone button to clone the project or download the the project. Then from Android studio click on file and  select import to import the project from your local machine.

To successfully run this program, you need to generate/create four different accouts one for the contract owner and the remaining three for the employees. You can  create accounts using [myalgo](https://wallet.myalgo.com/access).

# File Structure
- `EmployeeAdapter` handles the recyclerview for the list of employees
- `constants` handles constant variables used in the MainActivity and DetailActivity
- `MainActivity` handles the main logic of the application
- `DetailActivity` handles the detail page for each employees
- `Employee` handles the data model
- `EmployeeDataSource` handles dummy data/list of empployees


