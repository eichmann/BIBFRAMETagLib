package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationRelationIterator theDissertationRelationIterator = (DissertationRelationIterator)findAncestorWithClass(this, DissertationRelationIterator.class);
			pageContext.getOut().print(theDissertationRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for relation tag ");
		}
		return SKIP_BODY;
	}
}
