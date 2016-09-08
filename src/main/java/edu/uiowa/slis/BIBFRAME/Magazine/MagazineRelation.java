package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineRelationIterator theMagazineRelationIterator = (MagazineRelationIterator)findAncestorWithClass(this, MagazineRelationIterator.class);
			pageContext.getOut().print(theMagazineRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for relation tag ");
		}
		return SKIP_BODY;
	}
}

