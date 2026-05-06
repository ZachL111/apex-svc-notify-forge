# apex-svc-notify-forge

`apex-svc-notify-forge` is a compact Kotlin repository for backend services, centered on this goal: Design a Kotlin verification harness for notify systems, covering resource planning, capacity fixtures, and failure-oriented tests.

## Use Case

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Apex Svc Notify Forge Review Notes

The first comparison I would make is `queue pressure` against `queue pressure` because it shows where the rule is most opinionated.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/apex-svc-notify-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Kotlin addition stays small enough to inspect in one sitting.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The same command runs the local verification path. The highest-scoring domain case is `stale` at 192, which lands in `ship`. The most cautious case is `baseline` at 64, which lands in `hold`.

## Future Work

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
