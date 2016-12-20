package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonFollowsIterator thePersonFollowsIterator = (PersonFollowsIterator)findAncestorWithClass(this, PersonFollowsIterator.class);
			pageContext.getOut().print(thePersonFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for follows tag ");
		}
		return SKIP_BODY;
	}
}

