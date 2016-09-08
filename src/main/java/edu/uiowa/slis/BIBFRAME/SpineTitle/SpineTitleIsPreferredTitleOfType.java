package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleIsPreferredTitleOfIterator theSpineTitleIsPreferredTitleOfIterator = (SpineTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, SpineTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theSpineTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

