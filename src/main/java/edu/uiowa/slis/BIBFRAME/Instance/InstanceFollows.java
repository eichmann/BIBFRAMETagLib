package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceFollowsIterator theInstanceFollowsIterator = (InstanceFollowsIterator)findAncestorWithClass(this, InstanceFollowsIterator.class);
			pageContext.getOut().print(theInstanceFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for follows tag ");
		}
		return SKIP_BODY;
	}
}

