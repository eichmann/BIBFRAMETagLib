package edu.uiowa.slis.BIBFRAME.Restriction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RestrictionMinCardinality extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RestrictionMinCardinality currentInstance = null;
	private static final Log log = LogFactory.getLog(RestrictionMinCardinality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RestrictionMinCardinalityIterator theRestriction = (RestrictionMinCardinalityIterator)findAncestorWithClass(this, RestrictionMinCardinalityIterator.class);
			pageContext.getOut().print(theRestriction.getMinCardinality());
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for minCardinality tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for minCardinality tag ");
		}
		return SKIP_BODY;
	}
}

