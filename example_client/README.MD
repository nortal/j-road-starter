# Example for client usage of X-Road (when your application consumes other services)

## Steps
1. Copy all needed WSDL files (for consumed services) into your project.
1. Cenerate Java-classes source into the project (read "Generated sources" block)
1. Add j-road-client.jar into dependencies
1. Create new service class that extends "XroadClientWebService" (see "InstallationXroadService" class as example)
1. Create, or find out, if you have security X-Road service for testing purposes.
1. Your user of your security server must be allowed to consume services.
1. Now you are ready to test service.

## Generated sources

Don't change classes in __\*\*/generated/\*\*__ packages.

Generated source is committed and not generated on each build. The reasons are:
1. Build doesn't depend on external services that might be down. That's why we have wsdl/xsd in our sources.
1. As wsdl/xsd are always the same (inside the project) there's no need to regenerate the source each time.
1. Regenerate classes only on wsdl/xsd changes or build scripts changes
(see block "HOWTO regenerate WSDL/XSD into Java classes").

### HOWTO regenerate WSDL/XSD into Java classes

1. Renew wsdl/xsd files in resources of this module.
1. Run `gradle build` with flag `-PgenWsdlClasses`.
1. Commit changed generated sources into VCS.
