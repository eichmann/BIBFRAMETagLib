package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsUnionOfIterator theMagazineIsUnionOfIterator = (MagazineIsUnionOfIterator)findAncestorWithClass(this, MagazineIsUnionOfIterator.class);
			pageContext.getOut().print(theMagazineIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

