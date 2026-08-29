# NOTICE

ErrorSMPModDetector's channel-based detection lineage is a modified fork of
[0xnim/mod-detection-plugin](https://github.com/0xnim/mod-detection-plugin), licensed
under the GNU General Public License v3.0. As required by the GPLv3, this fork remains
licensed under GPLv3 and this notice documents the substantive changes made:

- Rebranded as ErrorSMPModDetector for the ErrorSMP server.
- Package/class layout reorganized under `xyz.nim.modDetectorPlugin`.
- Added the `hackcheck` subsystem: sign-probe translation/keybind fingerprinting
  (ported from the technique used by [CheckHacks](https://github.com/branduzzo/CheckHacks)),
  including same-tick open/revert, pure translation-probe lines (no marker/canary),
  masked off-to-the-side sign placement, on-join auto-checking, and
  deferred/combined kick messaging merging sign-probe and channel-based results.
- Replaced the bundled mod/hack catalogs with an independently maintained set
  (`mods.yml`, `hacks.yml`) - entries are compiled from mods' own public source
  repositories or from open detection tools, not extracted from any closed-source
  commercial product.
- Added three brand-string anomaly heuristics (blank/missing brand, a "vanilla"
  brand with plugin channels registered, and a "Geyser" brand Floodgate doesn't
  recognize as a real Bedrock connection), ported from the same upstream fork's
  built-in checks and re-expressed as ordinary catalog entries
  (`no-brand`/`vanilla-spoof`/`geyser-spoof`) instead of hardcoded logic - a
  deliberate divergence, not a gap, kept consistent with this fork's single-catalog
  design.

Source for this fork is available alongside its distributed binary, per GPLv3 §5/§6.
