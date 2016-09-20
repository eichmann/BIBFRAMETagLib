package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasOtherEditionInverseIterator theMagazineHasOtherEditionInverseIterator = (MagazineHasOtherEditionInverseIterator)findAncestorWithClass(this, MagazineHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theMagazineHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

