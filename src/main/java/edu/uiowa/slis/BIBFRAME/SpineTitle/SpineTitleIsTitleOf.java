package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleIsTitleOfIterator theSpineTitleIsTitleOfIterator = (SpineTitleIsTitleOfIterator)findAncestorWithClass(this, SpineTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theSpineTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

