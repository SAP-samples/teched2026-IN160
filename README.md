# IN160 - Explore version control and automation with GitHub in Cloud Integration

## Description

This repository contains the exercise materials for the SAP TechEd 2026 hands-on workshop called IN160 - Explore version control and automation with GitHub in Cloud Integration.

## Introduction to version control and GitHub

Version control is a system that tracks changes to your files over time, so you can see what changed, when, and who changed it — and go back to an earlier state if something goes wrong. Git is the most widely used version control system. It stores your files in a repository, and every time you save a snapshot of your work — called a commit — Git records what changed along with a short message you write to describe the change. GitHub is a platform that hosts Git repositories in the cloud, making it easy to back up your work, share it with colleagues, and collaborate on the same files without overwriting each other's changes.

## Overview

This workshop will teach you about the GitHub version control feature of the Cloud Integration capability of SAP Integration Suite.

You will learn how to connect your SAP Integration Suite tenant to a GitHub repository and how to perform the basic Git operations.

The last exercise goes into slightly more advanced territory: Setting up a CI/CD pipeline with GitHub Actions to validate your integration flows.

You will each work on the exercises on your own and at your own pace, but if you have questions or get stuck at any point, please contact your instructors, who will be happy to help you out!

> [!IMPORTANT]
> During the exercises you will log in to GitHub and the SAP Integration Suite tenant. If the browser offers to save your password, please decline.

> [!IMPORTANT]
> Before you leave the hands-on workshop, you must delete the GitHub access token and sign out of GitHub. You do this in step 9 of [exercise 6](exercises/ex6/).

## Requirements

To complete the exercises in this repository you need access to an SAP Integration Suite tenant. We provide the two following tenants for the workshop. The instructors will let you know which one you should use. Please stick to that one tenant during the whole workshop.

- Option 1: Workshop tenant [**workshop03a**](https://url.sap/vutrsb)
- Option 2: Workshop tenant [**workshop03b**](https://url.sap/17o8td)

Log in with user **userXXX** with **XXX** being 001, 002, etc.

> [!NOTE]
> Please replace **XXX** with the number assigned to you. This number and the password will be provided to you by the instructors at the beginning of the workshop.

## Prerequisites

To complete the exercises in this workshop you need a GitHub user. If you already have one, you can go directly to exercise 1. Otherwise please complete this prerequisite exercise.
- [Exercise 0 - Create a GitHub account](exercises/ex0/)

## Exercises

All the workshop exercises are listed below. Use this section as an index or table of contents. Please note that each exercise builds on the previous one, so they must be completed in the order shown.

In the first exercise you create a new GitHub repository for your integration flows and set up an access token.
- [Exercise 1 - Create a GitHub repository and a personal access token](exercises/ex1/)

In exercise two you connect your tenant to the new repository and create an integration flow.
- [Exercise 2 - Connect your repository and create an integration flow](exercises/ex2/)

In the third exercise you push the new integration flow to your GitHub repository.
- [Exercise 3 - Push your integration flow to GitHub](exercises/ex3/)

In exercise four you clone the repository to your laptop and work on a Groovy script locally.
- [Exercise 4 - Work with your integration flow locally](exercises/ex4/)

Exercise five teaches you how you can import an integration flow from GitHub.
- [Exercise 5 - Restore your integration flow from GitHub](exercises/ex5/)

In the last exercise you set up a CI/CD pipeline with GitHub Actions.
- [Exercise 6 - Check your integration flow automatically with GitHub Actions](exercises/ex6/)

## Contributing

Please read the [CONTRIBUTING.md](./CONTRIBUTING.md) to understand the contribution guidelines.

## Code of Conduct

Please read the [SAP Open Source Code of Conduct](https://github.com/SAP-samples/.github/blob/main/CODE_OF_CONDUCT.md).

## How to Obtain Support

Support for the content in this repository is available during the hands-on workshop for which this content has been designed. Otherwise, you may request support via the [Issues](../../issues) tab.

## License

Copyright (c) 2026 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE](LICENSES/Apache-2.0.txt) file.
