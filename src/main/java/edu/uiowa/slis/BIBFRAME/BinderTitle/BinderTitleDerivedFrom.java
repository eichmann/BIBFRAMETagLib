package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleDerivedFromIterator theBinderTitleDerivedFromIterator = (BinderTitleDerivedFromIterator)findAncestorWithClass(this, BinderTitleDerivedFromIterator.class);
			pageContext.getOut().print(theBinderTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

