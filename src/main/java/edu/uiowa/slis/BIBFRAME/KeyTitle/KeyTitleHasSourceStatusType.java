package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyTitleHasSourceStatusIterator theKeyTitleHasSourceStatusIterator = (KeyTitleHasSourceStatusIterator)findAncestorWithClass(this, KeyTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theKeyTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

