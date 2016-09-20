package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineAccompaniedByIterator theMagazineAccompaniedByIterator = (MagazineAccompaniedByIterator)findAncestorWithClass(this, MagazineAccompaniedByIterator.class);
			pageContext.getOut().print(theMagazineAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

