# 612-Template
Captains: use this to start new projects and update to your necessities.

# Set-up

In Settings:
- Options - Under the Merge button heading, unchecked "Allow rebase merging", checked "Allow auto-merge" (see notes on this below), checked "Automatically delete head branches" (can restore if necessary for up to 30-Days)
- Branches

# Github Actions
- Created a new "Java CI with Gradle" action file. Under main branch, the ```branches:``` option reads ```[main]``` only but under the feature-template branch, the ```branches:``` option reads ```[main, feature-template].``` 
