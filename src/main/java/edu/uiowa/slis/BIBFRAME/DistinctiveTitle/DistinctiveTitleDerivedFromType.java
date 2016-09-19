package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitleDerivedFromIterator theDistinctiveTitleDerivedFromIterator = (DistinctiveTitleDerivedFromIterator)findAncestorWithClass(this, DistinctiveTitleDerivedFromIterator.class);
			pageContext.getOut().print(theDistinctiveTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

