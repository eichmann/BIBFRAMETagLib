package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConciseTitleDerivedFromIterator theConciseTitleDerivedFromIterator = (ConciseTitleDerivedFromIterator)findAncestorWithClass(this, ConciseTitleDerivedFromIterator.class);
			pageContext.getOut().print(theConciseTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

