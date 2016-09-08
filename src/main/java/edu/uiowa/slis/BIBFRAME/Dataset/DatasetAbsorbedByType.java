package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetAbsorbedByIterator theDatasetAbsorbedByIterator = (DatasetAbsorbedByIterator)findAncestorWithClass(this, DatasetAbsorbedByIterator.class);
			pageContext.getOut().print(theDatasetAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

