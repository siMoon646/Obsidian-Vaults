# Claude Code Contributions to `script.js`

This file records which parts of `script.js` were written or changed by Claude Code (Anthropic's AI coding assistant) and which were not. It covers one working session on **2026-10-08**.

---

## What Claude Code Wrote

### 1. Enemy clamping

I asked for the two player-clamping lines to be repeated for both enemies. Claude Code wrote the enemy clamping by copying the existing pattern and substituting each enemy's own size.

### 2. Moving values into the object literals

At my direction, Claude Code copied `moveX`, `moveY` and `distance` fields to `player`, `enemy.e1` and `enemy.e2`, and changed `update()` to use those fields in place of local constants. It chose the shared names `moveX` / `moveY` / `distance` so one helper function can work on any of the three objects.

### 3. Enemies tracking the center of the player

I asked for the enemies to aim at the center of the player instead of its top-left corner. Claude Code changed my `setTarget()` helper to add half of the target's size to the target position, using `(objTarget.size || 0) / 2` so the cursor, which has no size, is unaffected. I added a second comment explaining the fallback.

### 4. This document

Claude Code wrote 95% of it.

---

## What Claude Code Fixed in My Code

- **Enemy object literal.** My first version had syntax errors:
  - `speed, 40` in place of `speed: 40`
  - a `;` between properties where a `,` belongs
  - `m1 : monster1 = { ... }` in place of a plain nested object

  Claude Code corrected these. I then renamed the object to `enemy` and chose the positions, sizes and speeds.

- **Typos that behaved as logical bugs.** For example, using `player` instead of `enemy.e1` / `enemy.e2`.

---

## What Claude Code Explained but Did Not Write

- What the `pointerup` and `pointercancel` events are and when each fires.
- Why a `;` inside an object literal produces a confusing "expected more properties" style error.
- Whether my comment on the initial `draw()` call was accurate. I adopted its suggested wording.
- A reminder of what default parameters are, and two ways to let `moveObj()` use `deltaTime`: pass it in as an argument, or make it a shared variable. I chose the shared variable and wrote that change myself.
- How `fillRect` works: its `x`, `y`, `width` and `height` arguments, the top-left origin, and that the color comes from `fillStyle`.
- What the `||` operator does when used to supply a fallback value.
- Why two squares can still overlap by a few pixels when a collision is detected: movement happens in steps of a few pixels per frame.

---

## Outside `script.js`

Claude Code also changed the instructions sentence in `index.html` to describe the new cursor controls.
