To reproduce this you're going to need to point this at a valid oauth 2 provider, or simulate locally with keycloak docker

I followed these instructions https://www.keycloak.org/getting-started/getting-started-docker

In addition enable in the client:

* access type - confidential

* standard flow

* implicit flow

* direct access grants

* service accounts enabled


Issue behavior:

The oauth 2 access token is received and the application hangs perpetually

Expected behavior:

The oauth 2 service returns an access token, which should be used in the subsequent headers for the call to google.
