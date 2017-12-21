fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

## Choose your installation method:

| Method                     | OS support                              | Description                                                                                                                           |
|----------------------------|-----------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|
| [Homebrew](http://brew.sh) | macOS                                   | `brew cask install fastlane`                                                                                                          |
| Installer Script           | macOS                                   | [Download the zip file](https://download.fastlane.tools). Then double click on the `install` script (or run it in a terminal window). |
| RubyGems                   | macOS or Linux with Ruby 2.0.0 or above | `sudo gem install fastlane -NV`                                                                                                       |

# Available Actions
## Android
### android test
```
fastlane android test
```
Runs all the tests
### android release_backable_fragment
```
fastlane android release_backable_fragment
```
Upload Backable Fragment Protocol
### android release_date_formatter
```
fastlane android release_date_formatter
```
Upload Date Formatter Protocol
### android release_disposer
```
fastlane android release_disposer
```
Upload Disposer Protocol
### android release_message_presenter
```
fastlane android release_message_presenter
```
Upload Message Presenter Protocol
### android deploy
```
fastlane android deploy
```
Deploy all libs to maven

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
