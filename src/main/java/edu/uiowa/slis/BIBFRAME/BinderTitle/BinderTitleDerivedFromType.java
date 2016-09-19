package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleDerivedFromIterator theBinderTitleDerivedFromIterator = (BinderTitleDerivedFromIterator)findAncestorWithClass(this, BinderTitleDerivedFromIterator.class);
			pageContext.getOut().print(theBinderTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

