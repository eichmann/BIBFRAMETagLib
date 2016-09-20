package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsPartOfIterator theMagazineIsPartOfIterator = (MagazineIsPartOfIterator)findAncestorWithClass(this, MagazineIsPartOfIterator.class);
			pageContext.getOut().print(theMagazineIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

