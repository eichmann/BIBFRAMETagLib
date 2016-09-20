package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasInstanceIterator theMagazineHasInstanceIterator = (MagazineHasInstanceIterator)findAncestorWithClass(this, MagazineHasInstanceIterator.class);
			pageContext.getOut().print(theMagazineHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

