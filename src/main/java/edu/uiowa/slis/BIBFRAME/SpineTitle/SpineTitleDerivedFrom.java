package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleDerivedFromIterator theSpineTitleDerivedFromIterator = (SpineTitleDerivedFromIterator)findAncestorWithClass(this, SpineTitleDerivedFromIterator.class);
			pageContext.getOut().print(theSpineTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

