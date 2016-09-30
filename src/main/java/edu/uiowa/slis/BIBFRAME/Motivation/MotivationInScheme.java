package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationInScheme extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationInScheme currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationInScheme.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationInSchemeIterator theMotivationInSchemeIterator = (MotivationInSchemeIterator)findAncestorWithClass(this, MotivationInSchemeIterator.class);
			pageContext.getOut().print(theMotivationInSchemeIterator.getInScheme());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

