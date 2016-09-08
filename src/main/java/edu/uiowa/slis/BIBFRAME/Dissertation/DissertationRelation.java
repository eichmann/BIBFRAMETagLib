package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationRelationIterator theDissertationRelationIterator = (DissertationRelationIterator)findAncestorWithClass(this, DissertationRelationIterator.class);
			pageContext.getOut().print(theDissertationRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for relation tag ");
		}
		return SKIP_BODY;
	}
}

