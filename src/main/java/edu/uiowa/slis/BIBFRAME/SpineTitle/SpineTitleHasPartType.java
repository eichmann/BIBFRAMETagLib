package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleHasPartIterator theSpineTitleHasPartIterator = (SpineTitleHasPartIterator)findAncestorWithClass(this, SpineTitleHasPartIterator.class);
			pageContext.getOut().print(theSpineTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

