package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleDerivedFromIterator theTitleDerivedFromIterator = (TitleDerivedFromIterator)findAncestorWithClass(this, TitleDerivedFromIterator.class);
			pageContext.getOut().print(theTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

