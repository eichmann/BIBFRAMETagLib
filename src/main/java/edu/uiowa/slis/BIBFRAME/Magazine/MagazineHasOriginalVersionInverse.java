package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasOriginalVersionInverseIterator theMagazineHasOriginalVersionInverseIterator = (MagazineHasOriginalVersionInverseIterator)findAncestorWithClass(this, MagazineHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theMagazineHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

