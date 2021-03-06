package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationInSchemeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationInSchemeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationInSchemeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationInSchemeIterator theMotivationInSchemeIterator = (MotivationInSchemeIterator)findAncestorWithClass(this, MotivationInSchemeIterator.class);
			pageContext.getOut().print(theMotivationInSchemeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

