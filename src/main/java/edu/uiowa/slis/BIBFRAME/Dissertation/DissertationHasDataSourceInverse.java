package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasDataSourceInverseIterator theDissertationHasDataSourceInverseIterator = (DissertationHasDataSourceInverseIterator)findAncestorWithClass(this, DissertationHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theDissertationHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

