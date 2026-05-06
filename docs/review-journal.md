# Review Journal

The review surface for `apex-svc-notify-forge` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 64, lane `hold`
- `stress`: `retry load`, score 158, lane `ship`
- `edge`: `worker slack`, score 190, lane `ship`
- `recovery`: `session drift`, score 137, lane `watch`
- `stale`: `queue pressure`, score 192, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
