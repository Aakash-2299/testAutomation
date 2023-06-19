@test
Feature: login

Scenario Outline: login with valid creds
When print welcome "<Name>"
Examples:
	| Name |
	| Aakash |
	| Chintu |