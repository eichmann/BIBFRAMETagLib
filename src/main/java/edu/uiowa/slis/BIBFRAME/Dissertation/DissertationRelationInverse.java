package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationRelationInverseIterator theDissertationRelationInverseIterator = (DissertationRelationInverseIterator)findAncestorWithClass(this, DissertationRelationInverseIterator.class);
			pageContext.getOut().print(theDissertationRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for relation tag ");
		}
		return SKIP_BODY;
	}
}

