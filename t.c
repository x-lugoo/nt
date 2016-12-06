#include<stdio.h>
#include<stdlib.h>
#include<syslog.h>

int main(void)
{
	char name[20];
	
	memset(name,0,sizeof(name));
	strcpy(name,"jeff");
	openlog("jee",LOG_CONS | LOG_PID,0);
	printf("name=%s\n",name);
	syslog(LOG_DEBUG,"name = %s\n",name);
	closelog();
	return 0;
}

