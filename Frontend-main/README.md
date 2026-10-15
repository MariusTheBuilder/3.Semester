# Frontend

## Prerequisites

You only need **[Node.js](https://nodejs.org/)** (npm is installed together with it). You do **not** need to install the Angular CLI yourself — it is a dev dependency of this project and is installed locally by `npm install`.

**Node.js version matters.** Angular 22 requires one of: `22.22.3` or newer in v22, `24.15.0` or newer in v24, or `26.0.0`+. Older versions (e.g. Node 18 or 20) will not work, even if `npm install` seems to succeed. The project uses `npm@10.9.9`.

Check that everything works:

```bash
node -v
npm -v
```

## Run the frontend locally (only Node.js installed)

1. Go into the frontend folder:

   ```bash
   cd Frontend
   ```

2. Install dependencies (only the first time, or when `package.json` has changed). This also downloads the Angular CLI into `node_modules`:

   ```bash
   npm install
   ```

3. Start the dev server:

   ```bash
   npm start
   ```

   `npm start` runs `ng serve` using the project's local Angular CLI, so it works without a global install. This is equivalent:

   ```bash
   npx ng serve
   ```

   > Don't type plain `ng serve` unless you have installed the Angular CLI globally — you will get `ng: command not found`.

4. Open [http://localhost:4200/](http://localhost:4200/) in your browser. The page reloads automatically when you save changes to the code.

Stop the server with `Ctrl + C`.

### Useful flags

Pass flags through npm with `--`:

```bash
npm start -- --open          # opens the browser automatically
npm start -- --port 4300     # use a different port if 4200 is taken
```

Or with npx:

```bash
npx ng serve --open
npx ng serve --port 4300
```

### Other commands (without the global CLI)

```bash
npm run build        # production build (same as npx ng build)
npx ng generate component my-component
```

### Optional: install the Angular CLI globally

Not required, but if you want to type `ng` directly:

```bash
npm install -g @angular/cli
```

## Backend / proxy

`ng serve` uses `proxy.conf.json`, which forwards all calls to `/api` to `http://localhost:8080`.

If the backend is not running, the page will load but API calls will fail (typically `502`/`ECONNREFUSED` in the terminal). Start the backend on port `8080`, or change `target` in `proxy.conf.json`.

## Troubleshooting

- **`ng: command not found`** — you don't have the CLI globally. Use `npm start` or `npx ng serve` instead.
- **`'ng' is not recognized` / `Cannot find module @angular/...`** — dependencies are missing. Run `npm install` in the `Frontend` folder.
- **`Port 4200 is already in use`** — close the other process, or run `npm start -- --port 4300`.
- **Errors about unsupported Node version, or `ng serve` crashing right away** — run `node -v` and compare with the requirement under Prerequisites. Install a newer Node.js from [nodejs.org](https://nodejs.org/) (or use `nvm install 24`), then delete `node_modules` and run `npm install` again.
