package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineRelationInverseIterator theMagazineRelationInverseIterator = (MagazineRelationInverseIterator)findAncestorWithClass(this, MagazineRelationInverseIterator.class);
			pageContext.getOut().print(theMagazineRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for relation tag ");
		}
		return SKIP_BODY;
	}
}

