FROM node:latest

LABEL author="Poriadin Oleksandr ale.poryadin@gmail.com"

ENV NODE_ENV=production
ENV PORT=3000

COPY . /var/ui

WORKDIR /var/ui

VOLUME [ "/var/ui" ]
 
RUN npm install


EXPOSE $PORT

ENTRYPOINT [ "npm","start" ]