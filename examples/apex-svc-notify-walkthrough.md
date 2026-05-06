# Apex Svc Notify Forge Walkthrough

This note is the quickest way to read the extra review model in `apex-svc-notify-forge`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 64 | hold |
| stress | retry load | 158 | ship |
| edge | worker slack | 190 | ship |
| recovery | session drift | 137 | watch |
| stale | queue pressure | 192 | ship |

Start with `stale` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `baseline` becomes less cautious without a clear reason, I would inspect the drag input first.
